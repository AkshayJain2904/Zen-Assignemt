function add (x:number,y:number): number {
    return x+y;
}
let c=add(10,20)
console.log("Result is "+c)

function multiply (x,y) {
    return x*y;
}
let b=multiply(2,4)
console.log(b)
//annonymous function
let anoAdd=function(a:number,b:number):number{
    return a+b;
}
console.log(anoAdd(20,40))

function f(shouludinitialize: boolean){
    if(shouludinitialize){
        var p=10;
    }
      return p;
}
console.log(f(true));
console.log(f(false));

//declaring a constant
const PI:number=3.14;
console.log(PI)

//object data type
let student={
    no:10,
    name:"Akshay",
    percent:23.43
};
console.log(student.name)
console.log("------------------------------------------")

let add1=(a,b) =>a+b;
console.log("adition is "+add1(10,20))


let message=() => {
    console.log("hello world")
    console.log("lamda")
}
message();

let raisevalue=x=>x+1;
console.log(raisevalue(10))
