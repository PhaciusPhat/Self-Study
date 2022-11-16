import { BrowserRouter, Route, Routes } from "react-router-dom";
import { routers } from './utils/routers';

function App() {
  return (
    <BrowserRouter className="App">
      <Routes>
        {routers.map((route, index) => <Route key={index} path={route.path} element={route.element}></Route>)}
      </Routes>
    </BrowserRouter>
  );
}

export default App;
