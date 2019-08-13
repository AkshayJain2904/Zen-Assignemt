var ar=[29,9,45];
var ar1=[171,3,89];
var ar3=["This", "is", "Java","Script"];
ar.sort
console.log(ar)
console.log(ar.length)                     //gives length 
console.log(ar.concat(ar1))             //joins to array
console.log(ar.includes(12))           //checks for having an element in array
console.log(ar3.join("*"))   //joins the array element
console.log(ar.pop())           //delete last element
console.log(ar3.push("tutorial"))   //adds an element
console.log(ar3.splice(2,0,"enjoying","it")) //adds an string at an specied position
console.log(ar3)
console.log(Math.max(ar1))
console.log(ar3.copyWithin(2,0))   //Copy the first two array elements to the last two array elements