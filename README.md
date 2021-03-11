## What is it about ? 

  In this repo you will find my own notes of learning Data Structures and Algorithms in Java.
  
## Why is it public ?

  If anyone finds it interesting and useful, I let everyone to use it
  
## Feedback
  ```
    public void feedback(String type, String message) {
        switch(type) {
            case "mistake":
                sendMail ("compate97@gmail.com", message);
                System.out.print("Thanks for your reply! I'll correct this")
                break;
            case "question":
                sendMail ("compate97@gmail.com", message);
                System.out.print("I'll answer ASAP !");
                break;
            case "thanks":
                sendMail ("compate97@gmail.com", message);
                gitFork();
                gitStar();
                System.out.print("I am glad that it will be useful to you");
                break;
             default:
                sendMail ("compate97@gmail.com", type, message);
                System.out.print("What I forgot ? ");
        }
    }
  ```
      
