const initialState = {};

const reducer = (state = initialState, { type, payload }) => {
  switch (type) {
    case "Call_List":
      state = payload;
      return { ...state };
    default:
      return state;
  }
};
export default reducer;
