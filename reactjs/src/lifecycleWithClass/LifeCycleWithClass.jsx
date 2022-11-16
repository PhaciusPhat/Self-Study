import React, { PureComponent } from "react";

export default class LifeCycleWithClass extends PureComponent {
  constructor(props) {
    super(props);
    this.state = { date: new Date() };
  }

  componentDidMount() {
    console.log("component did mount");
    this.timerID = setInterval(() => {
      this.tick();
    }, 1000);
  }

  componentWillUnmount() {
    console.log("component will unmount");
    clearInterval(this.timerID);
  }

  componentDidUpdate(prevProps, prevState, snapshot) {
    console.log(prevState);
  }

  // static getDerivedStateFromProps(props, state) {
  //   console.log("getDerivedStateFromProps");
  // }

  // shouldComponentUpdate(nextProps, nextState){
  //   return true;
  // }

  // getSnapshotBeforeUpdate(prevProps, prevState){
  //   return null;
  // }

  tick() {
    this.setState({
      date: new Date(),
    });
  }

  render() {
    return (
      <div>
        <h1>Hello, world!</h1>
        <h2>It is {this.state.date.toLocaleTimeString()}</h2>
      </div>
    );
  }
}
