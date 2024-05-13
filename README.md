# Application Testing

## About Project
This is a functional testing project for 3 basic applications consisting of API, Web, and Mobile.

## Test Case Document
- API: [Test Case](https://docs.google.com/spreadsheets/d/1i_G-oOlmLxXV2qiXfqHehO_6qh1V3bHjLc9Kd30nKnE/edit?usp=sharing)
- Web: [Test Case](https://docs.google.com/spreadsheets/d/17s3Q81sJVUgFnIGdLQms-d4lpD8QWMCOPmJxCCjfSVM/edit?usp=sharing)
- Mobile: [Test Case](https://docs.google.com/spreadsheets/d/1XuIm_LodO0nfzwtTL3yyMmgO_-q6YzwNd2JOA4wpplQ/edit?usp=sharing)

## Tech Stacks
- Visual Studio Code
- IntelliJ IDEA Community
- GitHub
- Google Spreadsheets
- ChatGPT
- Serenity BDD
- REST Assured
- Appium

## Test Results
- API: [Hasil Test Case](https://github.com/jstmnd/mini-project_ni-wayan-amanda-putri-astawa/assets/99030230/bc6bb2bf-70f9-4237-822d-f7f42fcd910a) 
- Web: [Hasil Test Case](https://github.com/jstmnd/mini-project_ni-wayan-amanda-putri-astawa/assets/99030230/d4a5403d-f735-4656-9d80-655cde8814e5)
- Mobile: [Hasil Test Case](https://github.com/jstmnd/mini-project_ni-wayan-amanda-putri-astawa/assets/99030230/622aa36a-f9a6-4e10-9c6a-085ec3e9f0b6)

## Setup 
- API: 
    1. mvn clean verify => for all case
    2. mvn clean verify -Dtags="(case_name)" => for one case
- Web: 
    1. mvn clean verify => for all case
    2. mvn clean verify -Dtags="(case_name)" => for one case
- Mobile: 
    1. npm test => for run test
    2. npm run report => for run test repost

## Other
Reporsitory for CI Testing: [CI Pipeline](https://github.com/jstmnd/mini-project_ci-testing)   