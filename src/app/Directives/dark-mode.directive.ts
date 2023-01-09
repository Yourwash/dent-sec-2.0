import {Directive, ElementRef, HostListener} from '@angular/core';

@Directive({
  selector: '[appDarkMode]'
})
export class DarkModeDirective {
  constructor(private el: ElementRef) {}

  @HostListener('click') onClick() {
    this.highlight('white');
  }

  private highlight(color: string) {
    this.el.nativeElement.style.backgroundColor = '';
  }

}
