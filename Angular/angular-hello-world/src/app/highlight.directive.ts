import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(private ele:ElementRef) { 
  }
  changeColor(color:string){
    this.ele.nativeElement.style.backgroundColor=color;
  }
  changeTxtColor(color:string){
    this.ele.nativeElement.style.color=color;
  }

  @HostListener('mouseenter')
  onMouseEnter(){
    this.changeColor('pink')
    this.changeTxtColor('blue')
  }

  @HostListener('mouseleave')
  onMouseLeave(){
    this.changeColor(null)
    this.changeTxtColor(null)
  }



}
