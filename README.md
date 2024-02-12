# BMIViewModel
# BMI Calculator App

This Android app built with Kotlin and Jetpack Compose is made as part of the Mobile Programming with Native Technologies course. The purpose of this project is to make a simple app utilizing ViewModel.

## Overview

This is a simple app that allows users to calculate their body mass index (BMI) based on their height and weight. This app provides a simple interface for users to input their height and weight, and it automatically calculates and displays their BMI.

## Features

- Input fields for height and weight
- Calculation of BMI based on user input
- Display of calculated BMI result
- Easy-to-use and intuitive UI

## Getting Started

To get started with this app, follow these steps:

1. Clone the repository to your local machine:

```
git clone https://github.com/your-username/bmi-calculator-app.git
```

2. Open the project in Android Studio.

3. Build and run the app on an emulator or physical device.

## Implementation Details

### ViewModel

The app uses a ViewModel class to hold all necessary information and operations. The ViewModel class contains member variables for height, weight, and BMI result, along with methods for updating these variables and calculating the BMI.

### UI

The UI is implemented using Jetpack Compose, a modern toolkit for building native Android UIs. It consists of input fields for height and weight, along with a text field to display the calculated BMI result.

### Libraries Used

The app uses the following libraries:

- Jetpack Compose: For building the UI
- AndroidX ViewModel: For managing UI-related data in a lifecycle-conscious way

### How to Use

1. Enter your height in meters.
2. Enter your weight in kilograms.
3. Your BMI will be automatically calculated and displayed.
