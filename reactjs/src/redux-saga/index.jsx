import React, { useEffect } from "react";
import { Provider, useSelector, useDispatch } from "react-redux";
import { Call_List } from "./reducer";
import { store } from "./store";
function InsideComponent() {
  const dispatch = useDispatch();
  const data = useSelector((state) => state.reducer.data);
  const renderArr = () => {
    return data
      ? data.map((e, index) => {
          return (
            <div key={index}>
              <div>
                Name: {e.first_name} {e.last_name}
              </div>
              <div>Position: {e.position}</div>
              <div>Team: {e.team.full_name}</div>
              <div>City: {e.team.city}</div>
              <hr />
            </div>
          );
        })
      : "";
  };

  useEffect(() => {
    dispatch(Call_List());
  }, [dispatch]);

  return (
    <>
      Redux Saga
      <hr />
      {renderArr()}
    </>
  );
}

const ReduxSaga = () => {
  return (
    <Provider store={store}>
      <InsideComponent />
    </Provider>
  );
};

export default ReduxSaga;
