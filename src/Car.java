class Car {
    private String make;
    private String model;
    private int maxSpeed;

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        if(make.isEmpty()){
            throw new IllegalArgumentException("Make cannot be empty");
        }else{
            this.make = make;
        }
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        if(model.isEmpty()){
            throw new IllegalArgumentException("Model cannot be empty");
        }else{
            this.model = model;
        }
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        if(maxSpeed < 50){
            throw new IllegalArgumentException("Max speed cannot be less than 50");
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public String toString() {
        return "The car make is " + this.make + " and model is " + this.model + " with top speed of " + this.maxSpeed + " MPH";
    }
}
