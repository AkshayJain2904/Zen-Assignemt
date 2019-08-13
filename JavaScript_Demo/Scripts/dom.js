var btn=document.getElementById("test")
var p=document.querySelector("#output")
btn.addEventListener('click',function(){
    p.style.backgroundColor="red"
    p.style.color="white"
    p.innerHTML="Hello from DOM"
    
})