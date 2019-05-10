import { Component } from '@angular/core'

@Component({
  selector: 'toolbar',
  template: `
    <div>
      Hello from toolbar component
    </div>
    <div>
      <h3>My Article</h3>
      <p>my article body</p>
    </div>
  `,
})
export class ToolbarComp {

  constructor() {

  }
}
