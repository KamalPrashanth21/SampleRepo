const express = require('express');
require('dotenv').config();
const connectDB = require('./config/db');

const app = express();
app.use(express.json()); // Middleware to parse JSON

// Connect to MongoDB
connectDB();

// Import Routes
const productRoutes = require('./routes/productRoutes');
app.use('/api/products', productRoutes);

const PORT = process.env.PORT || 3030;
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
