class student{
    no:number
    name:string
    constructor(no:number,name:string){
        this.no=no
        this.name=name
    }
    display():void{
        console.log(this.no+" "+this.name)
    }
};

let ob1:student=new student(12,"Ram")
ob1.display()