.class public final synthetic Lcom/facebook/react/views/textinput/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH0/h;


# instance fields
.field public final synthetic a:Lcom/facebook/react/views/textinput/ReactEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/textinput/c;->a:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/c;->a:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 2
    .line 3
    check-cast p1, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->a(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
