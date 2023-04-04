import mongoose from "mongoose";
import env from "env";

const mongooseMiddleware = async (req, res, next) => {
  if (mongoose.connections[0].readyState) {
    return next();
  }
  try {
    await mongoose.connect(
      `mongodb+srv://${process.env.db_username}:${process.env.db_password}@itggmongodb.ppba9ee.mongodb.net/?retryWrites=true&w=majority`
    );
    next();
  } catch (e) {
    console.log(e);
  }
};

let connection;

const connectDB = async (App: Function) => {
  try {
    connection = await mongoose.connect(
      `mongodb+srv://${env.DB_USERNAME}:${env.DB_PASSWORD}@${env.DB_URL}/?retryWrites=true&w=majority`
    );
    console.log("Connected to the server");
    return App;
  } catch (e) {
    console.error("Could not connect to MongoDB...");
    throw e;
  }
};

function getDBConnection() {
  return connection;
}

export { connectDB, getDBConnection, mongooseMiddleware };