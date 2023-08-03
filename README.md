# Road-Mapster: Smart Vacation Planner

Road-Mapster is an intelligent vacation planner that utilizes AI technology to generate personalized holiday plans. The concept revolves around providing input to the AI model and obtaining a dynamic map with pinned locations representing your holiday itinerary. Each pin on the map will be associated with pictures and a recommended route for your convenience. As of now, the repository only contains the plan generation logic, and a separate visual app is intended to act as a client for this component.

## Getting Started

To run this project successfully, you must first obtain API keys for both Google Maps and ChatGPT from OpenAI. Follow the steps below to set up the necessary configurations:

1. Create an `application.properties` file under `src/main/resources` in the project directory.
2. Add the following content to the `application.properties` file:
3. 
```properties
google.maps.api.key=YOUR_GOOGLE_MAPS_API_KEY
openai.api.key=sk-YOUR_OPENAI_CHATGPT_API_KEY
openai.api.url=https://api.openai.com/v1/chat/completions

## Contribution

We VERY welcome contributions from the community to enhance Road-Mapster's features and user experience. If you have any innovative ideas or improvements to offer, please feel free to contribute to the project. Together, we can make Road-Mapster an even more powerful and user-friendly vacation planning tool.

## License

Road-Mapster is licensed under the [GNU General Public License (GPL)](https://www.gnu.org/licenses/gpl-3.0.en.html). You are free to use, modify, and distribute the software in accordance with the terms of this license.

## Contact

If you have any questions, feedback, or suggestions, don't hesitate to get in touch with us. You can contact us through the project's repository or reach out to our team directly via email. We value your input and look forward to hearing from you.

Let's make vacation planning smart and enjoyable with Road-Mapster!
