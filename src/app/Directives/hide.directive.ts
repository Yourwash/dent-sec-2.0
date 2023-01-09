import {Directive, ElementRef, HostListener} from '@angular/core';

@Directive({
  selector: '[appHide]'
})
export class HideDirective {
  constructor(private el: ElementRef) {}

  @HostListener('click') onClick() {
    this.hide('none');
  }

  private hide(display: string) {
    this.el.nativeElement.style.display = display;
  }
}
