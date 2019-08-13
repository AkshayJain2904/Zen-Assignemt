//var btn = document.getElementById('test')
//var p = document.querySelector('#output')
//
//btn.addEventListener('click', function(){
//	p.innerHTML="wassup"
//	p.style.backgroundColor='gray'
//	p.style.color='white'
//})
 
function isNumber(valueToCheck){
	return !isNaN(valueToCheck)
}
 
 
 
window.onload=function(){
 
	var num=document.getElementById("myform").numericField
	var name=document.getElementById("myform").name
	var email=document.getElementById("myform").email
	var age=document.getElementById("myform").age
	var span=document.getElementById("span")
	var errorId=document.getElementById("errorId")
	var errorName=document.getElementById("errorName")
	var errorEmail=document.getElementById("errorEmail")
	var errorAge=document.getElementById("errorAge")
	var count=0
	var submitForm=document.getElementById("myform")
 
	var info=document.getElementById("info")
 
	var i=0
 
	num.onkeydown=function(evt){
		if(!isNumber(String.fromCharCode(evt.which))
		  && evt.which !==8){
			errorId.innerHTML="enter numeric data only"
			errorId.style.color='red'
//			this.style.color='white'
			evt.preventDefault()
		}
		else{
			info.innerHTML=""
//			this.style.color='white'
		}
 
	}
 
	name.onkeydown=function(evt){
		var v = name.value.toString()
		if(isNumber(String.fromCharCode(evt.which))
		  && evt.which !==8){
			errorName.innerHTML="Enter chars only"
			errorName.style.color='red'
//			this.style.color='white'
			evt.preventDefault()
		}
		else{
 
			if(evt.which!==8){
 
				count++
			}
			else if(count!==0){
			count--
			}
 
			info.innerHTML=""
		}
//		console.log(name.value.length+1)
		/*if(v.charAt(0)>=65 && v.charAt(0)<=90)
			console.log("no probs")*/
//		console.log(v.charAt(0))
		if(count===1)
			console.log((evt.which))
	}
 
	email.onkeydown=function(evt){
		if(!isNumber(String.fromCharCode(evt.which))
		  && evt.which !==8){
			errorEmail.innerHTML="enter numeric data only"
			errorEmail.style.color='red'
//			this.style.color='white'
			evt.preventDefault()
		}
		else{
			info.innerHTML=""
			this.style.backgroundColor='aqua'
//			this.style.color='white'
		}
 
	}
	age.onkeydown=function(evt){
		if(!isNumber(String.fromCharCode(evt.which))
		  && evt.which !==8 && count>2){
 
			errorAge.innerHTML="enter numeric data only"
			errorAge.style.color='red'
//			this.style.color='white'
			evt.preventDefault()
		}
		else{
			if(evt.which!==8){
 
				if(count<2){
					count++
					age.readOnly=false
				}
				else
					age.readOnly=true
			}
			else if(count!==0){
				age.readOnly=false
			count--}
		console.log(count)
			info.innerHTML=""
 
 
//			this.style.color='white'
		}
 
	}
}

