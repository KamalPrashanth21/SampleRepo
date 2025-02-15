const express = require('express');
const { createProduct, getProducts, getProduct, updateProduct, deleteProduct } = require('../Controller/productController');

const router = express.Router();

// Define API routes
router.post('/', createProduct);      // Create a new product
router.get('/', getProducts);         // Get all products
router.get('/:id', getProduct);       // Get a product by ID
router.put('/:id', updateProduct);    // Update a product by ID
router.delete('/:id', deleteProduct); // Delete a product by ID

module.exports = router;
