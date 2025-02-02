Project develop Bootcamp Microsoft AI for Tech - GitHub Copilot in https://web.dio.me/track/github-copilot and use https://www.4devs.com.br/gerador_de_numero_cartao_credito to generate card to validate

# Card Validator Application

This is a simple Java application that validates different types of credit cards based on their starting numbers.

## Supported Card Types

- **Visa**: Starts with `4`
- **MasterCard**: Starts with numbers between `51` and `55` or between `2221` and `2720`
- **Elo**: Starts with `4011`, `4312`, or `2389`
- **American Express**: Starts with `34` or `37`
- **Discover**: Starts with `6011`, `65`, or between `644` and `649`
- **Hipercard**: Starts with `6062`

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/cardvalidator.git
    cd cardvalidator
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

### Running the Application

You can run the application using the following command:
```sh
mvn spring-boot:run
