## RobotLikesMetallica
RobotLikesMetallica is a class where through the class *Desktop* and *Robot* enters youtube and likes the song ***Metallaica Nothing Else Matters***...

### How does it work
To make this simple program work , first throught Desktop class we can browse to google as soon as the first thread ends the *RedirectToYoutube* thread starts to run
. What does the second thread do is in this code below ,as we are seeing here at the beginning we have declared a string which contains the word that it will write,
then in the run method we declare the robot class where through its help we print each character one by one waiting for 500 milliseconds

```java
final String textToWrite = "Youtube";
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                Robot robot = new Robot();
                for(char ch : textToWrite.toCharArray()) {
                    int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
                    robot.keyPress(keyCode);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                robot.keyPress(KeyEvent.VK_ENTER);
```

Then with the mouseMove method we move the mouse to the right location then we make the mouse press
```java
 robot.mouseMove(214,313); //location to youtube link

                Thread.sleep(1500);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
 ```
 The other thread does roughly the same thing where everything has to do with mouse movement and typing.
# Why did i make it
I like to experiment with everything I learn even if it is for a small project.
I was listening to the song nothing else matters when I was learning the Robot class in java , 
and i learned that this class is used to generate native system input events. This class uses native system events to control
the mouse and keyboard.
So I said to myself why not make it through the Java Programming language to log in
Yotutube to search for this song and like it....

