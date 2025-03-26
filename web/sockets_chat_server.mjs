import express from 'express';
import { createServer } from 'http';
import { Server } from 'socket.io';

const app = express();
const server = createServer(app);
const io = new Server(server, {
  cors: {
    origin: '*',
  }
});

app.get('/', (req, res) => {
  res.send('Chat Server is running');
});

io.on('connection', (socket) => {
  console.log('A user connected:', socket.id);
  
  socket.on('chatMessage', (data) => {
    console.log(`Message from ${socket.id}: ${data}`);
    io.emit('chatMessage', { sender: socket.id, message: data });
  });

  socket.on('disconnect', () => {
    console.log('User disconnected:', socket.id);
  });
});

server.listen(5000, () => {
  console.log('Chat server running on port 5000');
});