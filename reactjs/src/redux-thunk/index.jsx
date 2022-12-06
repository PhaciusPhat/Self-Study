import React, { useEffect } from "react";
import { Provider, useSelector, useDispatch } from "react-redux";
import { store } from "./store";
import { Call_List } from "./action";
function InsideComponent() {
  const dispatch = useDispatch();
  const data = useSelector((state) => state.data);
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
      Redux Thunk
      <hr />
      {renderArr()}
    </>
  );
}

const ReduxThunk = () => {
  return (
    <Provider store={store}>
      <InsideComponent />
    </Provider>
  );
};

export default ReduxThunk;
