from flask import Flask, request, jsonify
from flask_sslify import SSLify
import requests

app = Flask(__name__)
sslify = SSLify(app)

CHATGPT_API_KEY = 'CHATGPT_API_KEY'
CHATGPT_API_URL = 'https://api.openai.com/v1/chat/completions'


@app.route('/process_message', methods=['POST'])
def process_message():
    try:
        # Получаем текст сообщения от приложения пользователя
        user_message = request.json['message']

        # Отправляем запрос к ChatGPT через API
        ai_response = get_ai_response(user_message)

        # Возвращаем ответ в приложение пользователя
        return jsonify({'response': ai_response})
    except Exception as e:
        return jsonify('error')


def get_ai_response(user_message):
    try:
        headers = {
            'Content-Type': 'application/json',
            'Authorization': f'Bearer {CHATGPT_API_KEY}'
        }

        data = {
            'messages': [{'role': 'system', 'content': 'You are a helpful assistant.'},
                         {'role': 'user', 'content': user_message}]
        }

        response = requests.post(CHATGPT_API_URL, json=data, headers=headers)
        response.raise_for_status()

        ai_response = response.json()['choices'][0]['message']['content']
        return ai_response
    except Exception as e:
        raise RuntimeError(f'Error in ChatGPT API request: {str(e)}')


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
