# A simple TODO service
[![CircleCI](https://circleci.com/gh/zhouhao/simple-todo-service.svg?style=svg)](https://circleci.com/gh/zhouhao/simple-todo-service)
### Background
My lovely wife always asks me to remind her something. But... I have a so bad memory...

### What it is
1. It has a simple [web UI](https://github.com/zhouhao/simple-todo-service/blob/master/other/screenshot-1.png), with which I can create a new todo item, and manage all todo items.
2. It has a schedule job, which runs every 10 minutes, and send sms to the target about something todo in the coming half an hour.
3. User can reply message to make the todo as completed, or delay it for half an hour.
4. That's all now.

### How to run
#### Dev
1. Just set active profile to `test`, and start it from Intellij or with Maven. (The application will use [H2 memory database](http://127.0.0.1:8888/h2-console), but no sms will be sent)
2. If you have [Plivo account](https://www.plivo.com/), You can update the [configuration](https://github.com/zhouhao/simple-todo-service/blob/master/src/main/resources/application.properties#L10-L12), and run with `active profile = dev`, so that you can receive real sms

### deploy to server
TBD 

### Screenshots
You can find some screenshots [here](https://github.com/zhouhao/simple-todo-service/tree/master/other).
