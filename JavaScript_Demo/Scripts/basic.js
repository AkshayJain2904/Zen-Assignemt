'use strict'
var x=10;
var y=10.5;
var z="Hello"
var isBreak=false
var noval;
var someVal=null

var obj={}   //this is an empty object   shortand notation of creating an object
console.log(obj+'type is'+typeof obj)


console.log('value is '+x +'and typeof x is '+typeof x);
console.log('value is '+y +'and typeof y is '+typeof y);
console.log('value is '+z +'and typeof z is '+typeof z);
console.log('value is '+isBreak +'and typeof isbreak is '+typeof isBreak);
console.log('value is '+noval +'and typeof noval is '+typeof noval);
console.log('value is'+someVal +'and typeof someval is '+typeof someVal);

var person={
    name:'Akshay',
    age:21,
    isEmployed:true
}
console.log(person)

var x1={}
var per={
     name:'Akshay',
    age:21
}
console.log(per.name==person.name)
console.log(x1===obj)


//longhand notation 

var newobj=new Object();
console.log(newobj)
newobj.fname='Sam'
newobj.isWorking=true
console.log(newobj)
console.log('-------------------------------')
console.log(1=='1')
console.log(8!=='5')





















