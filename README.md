# Test assignment for java developer position

## Navigate
- [Conditions](#conditions)
- [Examples](#examples)
- [Setup Basic](#setup-basic)
- [Setup Web](#setup-web)

## Goal of this project
Create a web service to check the results of a word game. 
The web service takes a json object and returns all the words that were used in the game correctly.
In case the game is finished early with an error in the word, it should return a list that contains all valid array objects before the error. 
If passed array is empty, return an empty array. An empty string in the array is considered invalid (error in the word).

## Conditions
- Using the Spring framework to implement a web service
- The array check is initialised by a call to the REST API, with array of strings (the format of the data transfer is JSON). 
The result of a REST API call is an array of correctly used words
- The solution must be in the form of a maven project which must contain:

  - Service implementation.
  - A unit test to check the service operability
of the service The test must contain the checking of all the cases specified in the example. Tests should be run when building the project via
maven, and if the tests are not passed the build is supposed to fail.
  - The project must be hosted on a public git repository.
  
## Examples

### Example 1
- ### input
  ````json
    {
      "words": [
        "fish",
        "horse",
        "egg",
        "goose",
        "eagle"
      ]
    }
  ````
- ### output
  ````json
    {
      "words": [
        "fish",
        "horse",
        "egg",
        "goose",
        "eagle"
      ]
    }
  ````
### Example 2
- ### input
  ````json
    {
      "words": [
        "fish",
        "horse",
        "snake",
        "goose",
        "eagle"
      ]
    }
  ````
- ### output
  ````json
    {
      "words": [
        "fish",
        "horse"
      ]
    }
  ````
- Since "horse" ends in "e" and "snake" begins with "s"!
### Example 3
- ### input
  ````json
    {
      "words": [
        "fish",
        "horse",
        "",
        "goose",
        "eagle"
      ]
    }
  ````
- ### output
  ````json
    {
      "words": [
        "fish",
        "horse"
      ]
    }
  ````
### Example 4
- ### input
  ````json
    {
      "words": [
        "",
        "horse",
        "",
        "goose",
        "eagle"
      ]
    }
  ````
- ### output
  ````json
    {
      "words": []
    }
  ````
## Setup Basic
- Make a fork of this repository to yourself and copy the link to the project.
- Create new project from version control in intellij IDEA and paste the link you copied earlier.
- Build the application using the intellij IDEA 'maven package' command in the terminal.
This should run unit tests and pack the project into the 'war' archive.

![maven package](https://i2.paste.pics/D5HRO.png)

- In the intellij IDEA terminal, you should see information that the tests were successful.

![test passed](https://i2.paste.pics/D5HVX.png)

## Setup Web
- Execute all items from [Setup Basic](#setup-basic).
- Configure Tomcat (Local) with : Deployment - war_exploded, context address - "/"
- Go to https://web.postman.co and register. 
- Download the Postman Agent https://www.postman.com/downloads
- Download the archive from https://drive.google.com/file/d/1UVNNTth_F8DaDmAFtTLYZSOZee6IJpR7/view?usp=sharing
- Go to 'workspace' select 'my workspace'.
- Under 'my workspace' select 'import'.

![import](https://i2.paste.pics/D5I54.png)

- Next upload files and select the .json file from the archive. 

![upload files](https://i2.paste.pics/D5I5O.png)

![choice json file](https://i2.paste.pics/D5I6L.png)

- Click import.

- Start the application in IDEA and wait for the application to come up.
- Go to the collection you imported. 
- Select the request or write your own (it must be an http POST method) and press 'Send'.
- The 'response' block should display a json. 
