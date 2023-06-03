package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.IconButton
import androidx.compose.material.DrawerState
import androidx.compose.material.DrawerValue
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonColor


@Composable
fun TopAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = {
            scope.launch { scaffoldState.drawerState.open() }
        }) {
            Image(
                painter = painterResource(id = R.drawable.ic_hamburger_menu),
                contentDescription = "Menu Icon",
                modifier = Modifier.size(24.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier
                .fillMaxWidth(0.5F)
                .padding(horizontal = 20.dp)
        )

        Box(modifier = Modifier.size(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
   // TopAppBar()
}

@Composable
fun DrawerContent() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(modifier = Modifier.padding(horizontal = 32.dp))
        // Avatar
        Image(
            painter = painterResource(id = R.drawable.baseline_person_outline_24),
            contentDescription = "User Avatar",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )

        // Name
        Text(
            text = "Hamza Afzal",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp, bottom = 64.dp)
        )
        Column(Modifier.fillMaxSize(), Arrangement.Bottom) {
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 48.dp), onClick = {}) {
                Text(
                    text = stringResource(R.string.drawer_option_faq),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            }
        }






        // Divider
        Divider(Modifier.padding(vertical = 8.dp))

        // Add additional options or content here...
    }
}

@Preview(showBackground = true)
@Composable
fun previewDrawer() {
    DrawerContent()
}


/**
 * IconButton(onClick = { }) {
Image(
painter = painterResource(id = R.drawable.ic_cart),
contentDescription = "Cart",
modifier = Modifier.size(24.dp)
)
}
 */