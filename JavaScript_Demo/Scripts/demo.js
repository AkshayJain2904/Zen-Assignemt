var x=10;
let y="hello"

for(var i=0; i<10;i++)
    {
        console.log(i);
    }
console.log("-------------------")
console.log(i);


var nums=[3,6,8,10,12,34]
var res=nums.map(function(a){
        return a*2;         
    })
console.log(res)

var res1=nums.map((a)=>a*2)

console.log(res1)

var res3=(x,y)=>x+y
console.log(res3(4,8))