# JavaDoro: CLI Pomodoro Timer in Java

## Introduction

JavaDoro is a command-line interface (CLI) application written in Java for managing Pomodoro sessions and breaks. This project was created to learn about Java and is made public for those who are also interested in this programming language and want to understand some of its syntax. JavaDoro is good for Java learners as it offers a variety of options for customizing and running Pomodoro sessions.

## Features

* Start Pomodoro sessions.
* Take short and long breaks.
* Customize session and break durations.
* Simple and intuitive CLI interface.

To run this project, you'll need a Java Development Kit (JDK) installed on your system. The project was developed using the latest JDK available at the time, so it should work with recent versions.

## Project Structure
The project consists of the following files:

* Chrono.java: Contains the main logic and CLI menus.
* Timers.java: Implements the timer and Pomodoro functionality.
* Interfacer.java: Handles user interaction and displays menus.

## Instructions

1. Clone the repository:

```sh
git clone https://github.com/Angcroft/JavaDoro.git
```

2. Navigate to the project directory:

```sh
cd JavaDoro
```

3. Compile the code:

```sh
javac Chrono.java Timers.java Interfacer.java
```

```sh
java Chrono
```

## How It Works

When you run the program, you'll see the main menu with options for different types of operations, selected by numeric characters.

### Main Menu Options

1. Pomodoro: Start a Pomodoro session.
2. Short Break: Take a short break.
3. Long Break: Take a long break.
4. Configure: Customize the duration of sessions and breaks.
5. Exit Program: Close the application.

#### Pomodoro Session

* Select "Pomodoro" from the main menu.
* A 25-minute timer (default) will start, and the elapsed time will be displayed every second.
* After the session, you can choose another action or exit the program.

#### Short Break

* Select "Short Break" from the main menu.
* A 5-minute timer (default) will start, and the elapsed time will be displayed every second.
* After the break, you can choose another action or exit the program.

#### Long Break

* Select "Long Break" from the main menu.
* A 15-minute timer (default) will start, and the elapsed time will be displayed every second.
* After the break, you can choose another action or exit the program.

### Configuration

Select "Configure" from the main menu. You can then choose to:

* Change the Pomodoro duration.
* Change the Short Break duration.
* Change the Long Break duration.
* Cancel and return to the main menu.

#### Changing Durations

* Choose the session or break duration you want to change.
* Enter the new duration in minutes.
* The program will update the duration and confirm the change.

### Examples

Basic Pomodoro Session

```sh
Main Menu:

1. Pomodoro
2. Short Break
3. Long Break
4. Configure
5. Exit Program
Enter choice: 1
Pomodoro Timer
Time elapsed: 00:00:01
...
Final time: 00:25:00
```

#### Customizing Durations - Changing Pomodoro Duration

```sh
Main Menu:

1. Pomodoro
2. Short Break
3. Long Break
4. Configure
5. Exit Program
Enter choice: 4

Configuration Menu:

1. Change Pomodoro duration
2. Change Short Break duration
3. Change Long Break duration
4. Auto start breaks (not implemented)
5. Auto start Pomodoros (not implemented)
6. Cancel
Enter choice: 1
How many minutes will take the Pomodoro?
Enter new duration: 30
Pomodoro duration updated to 1800 seconds.
```

## About the Use of This Project

This project is not intended for contributions, but you are free to use the code for your own projects. In accordance with the MIT License, I grant everyone the freedom to use this code for any beneficial purpose.