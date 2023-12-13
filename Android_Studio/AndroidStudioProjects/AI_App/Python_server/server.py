import os
from flask import Flask, request, jsonify
from flask_sslify import SSLify
from openai import OpenAI
from dotenv import load_dotenv

load_dotenv()

app = Flask(__name__)
sslify = SSLify(app, permanent=True)
#openai.api_key = os.getenv("OPENAI_API_KEY")
#openai.organization = os.getenv("OPENAI_ORGANIZATION")
client = OpenAI(api_key=os.getenv("OPENAI_API_KEY"),
                organization=os.getenv("OPENAI_ORGANIZATION"))


@app.route('/process_message', methods=['POST'])
def process_message():
    try:
        # Получаем текст сообщения от приложения пользователя
        user_message = request.json['message']

        #ai_response = get_ai_response(user_message)
        ai_response = user_message
        return jsonify({'response': ai_response})
    except Exception as e:
        return jsonify('error_server: ' + str(e))


#def get_ai_response(user_message):
#    try:
#        stream = client.chat.completions.create(
#            model='gpt-3.5-turbo-1106',
#            messages=[{'role': 'user', 'content': user_message}],
#            stream=True,
#        )
#        for chunk in stream:
#            if chunk.choices[0].delta and chunk.choices[0].delta.content:
#                return chunk.choices[0].delta.content
#        return "No response from the model."
#    except Exception as e:
#        raise RuntimeError(f'Error in ChatGPT API request: {str(e)}')


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=4000, ssl_context=('cert.pem', 'key.pem'))
