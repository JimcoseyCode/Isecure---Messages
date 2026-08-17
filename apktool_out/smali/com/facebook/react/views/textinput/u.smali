.class public final synthetic Lcom/facebook/react/views/textinput/u;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/views/textinput/ReactEditText;

.field public final synthetic b:Lcom/facebook/react/uimanager/ThemedReactContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/textinput/u;->a:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/views/textinput/u;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/u;->a:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/textinput/u;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->b(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
