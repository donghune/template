package io.github.donghune.template.feature.main

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

const val SEARCH_ROUTE = "search_route"

fun NavController.navigateToSearch(navOptions: NavOptions? = null) =
    navigate(SEARCH_ROUTE, navOptions)

fun NavGraphBuilder.searchScreen() {
    composable(route = SEARCH_ROUTE) {
        SearchRoute()
    }
}

@Composable
fun SearchRoute(
    modifier: Modifier = Modifier,
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val uiState = searchViewModel.uiState.collectAsStateWithLifecycle()

    SearchScreen(modifier)
}

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    Column {
        // SearchBar
        // SearchInterests
        // SearchTopic
        // SearchResult
    }
}

data class SearchUiState(
    val query: String = "",
    val isFocused: Boolean = false,
    val isInterestsVisible: Boolean = false,
    val isTopicVisible: Boolean = false,
    val isSearchResultVisible: Boolean = false,
    val searchResult: List<String> = emptyList(),
)

@HiltViewModel
class SearchViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState

    fun onQueryChange(query: String) {
        _uiState.value = _uiState.value.copy(query = query)
    }
}