import express from 'express';
import cors from 'cors';

const app = express();

app.use(cors());
app.use(express.json());

let books = []

app.get("/api/books",(req,res)=>{
	try{
		
	}catch(err){
		res.status(404).json({"error : " : err.message});
	}
});

const port = 3000;
app.listen(port,() => console.log(`app runnin ${port}`));