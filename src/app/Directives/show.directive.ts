import {Directive, ElementRef, HostListener} from '@angular/core';

@Directive({
  selector: '[appShow]'
})
export class ShowDirective {

  constructor(private el: ElementRef) {}

  @HostListener('click') onClick() {
    this.hide('');
  }

  private hide(display: string) {
    this.el.nativeElement.style.display = '';
  }

}
