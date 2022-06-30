package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public Worker (OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.errorCallback =  errorCallback;
        this.callback = callback;
    }



    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task" +" " +  i +" "+ "is done");
            if (i == 33){
                errorCallback.onError("Task"+" " + 33 + " " + "Is not done" );
            }
        }

    }
}


