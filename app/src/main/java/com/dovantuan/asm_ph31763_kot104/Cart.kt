package com.dovantuan.asm_ph31763_kot104

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import coil.compose.rememberImagePainter

@Preview(showBackground = true)
@Composable
fun Cart() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            ProductRow(
                imageUrl = "https://i.imgur.com/1tMFzp8.png",
                name = "Minimal Stand",
                price = "$25.00",
                quantity = "01"
            )
            ProductRow(
                imageUrl = "https://i.imgur.com/1tMFzp8.png",
                name = "Coffee Table",
                price = "$20.00",
                quantity = "01"
            )
            ProductRow(
                imageUrl = "https://i.imgur.com/1tMFzp8.png",
                name = "Minimal Desk",
                price = "$50.00",
                quantity = "01"
            )
        }
        PromoCodeInput()
        TotalAmount(total = "$95.00")
        CheckoutButton()
    }
}

@Composable
fun ProductRow(imageUrl: String, name: String, price: String, quantity: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Image(
            painter = rememberImagePainter(data = imageUrl),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(price, fontSize = 14.sp)
            Text("Quantity: $quantity", color = Color.Gray, fontSize = 14.sp)
        }
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .clickable { /* Handle remove item */ }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PromoCodeInput() {
    var promoCode by remember { mutableStateOf("") }
    OutlinedTextField(
        value = promoCode,
        onValueChange = { promoCode = it },
        label = { Text("Enter your promo code") },
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = null,
                modifier = Modifier.clickable { /* Handle promo code apply */ }
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    )
}

@Composable
fun TotalAmount(total: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Text("Total:", color = Color.Gray, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(total, color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun CheckoutButton() {
    Button(
        onClick = { /* Handle checkout */ },
        colors = ButtonDefaults.buttonColors(containerColor = Color("#242424".toColorInt())),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Text("Check Out", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCart() {
    Cart()
}
