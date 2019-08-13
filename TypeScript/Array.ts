let numArr: number[]=[10, 20, 30, 40, 50];
console.log(numArr);
 
let city:string[]=["Indore","Mumbai","Pune",];
console.log(city);
 
console.log("using for each");
numArr.forEach(ele=>{
    console.log(ele);
});
 
//Initializing array at the time of declaration
let arr1=[100,500,200,700]
console.log("Size of array1 is: "+arr1.length)

//using for in loop
for(let i in arr1)
{
    console.log(arr1[i])
}

//using for of loop
for(let e of arr1)
{
    console.log(e)
}