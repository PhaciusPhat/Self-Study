let express = require("express");
const cors = require("cors");
let app = express();
let port = 2222;
let host = "0.0.0.0";
app.use(cors());
app.listen(port);
console.log(`app is running on ${host}/${port}`);
app.get("/", (req, res) => {
  res.send({
    test: {
      type: "test",
      content: "test cai lon",
    },
  });
});
