import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.imagepickerlivecamera.R
import com.example.imagepickerlivecamera.ui.theme.ImagePickerLiveCameraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagePickerLiveCameraTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ImageViewer()
                }
            }
        }
    }
}

@Composable
fun ImageViewer(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_majoras_test_background),
        contentDescription = "@null",
        modifier = modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun ImageViewerPreview() {
    ImagePickerLiveCameraTheme {
        ImageViewer()
    }
}
