.class public final Lcom/facebook/react/views/textinput/ReactTextInputLocalData;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\r\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/facebook/react/views/textinput/ReactTextInputLocalData;",
        "",
        "Landroid/widget/EditText;",
        "editText",
        "<init>",
        "(Landroid/widget/EditText;)V",
        "Li7/B;",
        "apply",
        "Landroid/text/SpannableStringBuilder;",
        "text",
        "Landroid/text/SpannableStringBuilder;",
        "",
        "textSize",
        "F",
        "",
        "minLines",
        "I",
        "maxLines",
        "inputType",
        "breakStrategy",
        "",
        "placeholder",
        "Ljava/lang/CharSequence;",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final breakStrategy:I

.field private final inputType:I

.field private final maxLines:I

.field private final minLines:I

.field private final placeholder:Ljava/lang/CharSequence;

.field private final text:Landroid/text/SpannableStringBuilder;

.field private final textSize:F


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    const-string v0, "editText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->text:Landroid/text/SpannableStringBuilder;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->textSize:F

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/widget/TextView;->getMinLines()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->minLines:I

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/widget/TextView;->getMaxLines()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->maxLines:I

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/widget/TextView;->getInputType()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->inputType:I

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/widget/TextView;->getBreakStrategy()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->breakStrategy:I

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->placeholder:Ljava/lang/CharSequence;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final apply(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    const-string v0, "editText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->text:Landroid/text/SpannableStringBuilder;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iget v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->textSize:F

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->minLines:I

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinLines(I)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->maxLines:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 25
    .line 26
    .line 27
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->inputType:I

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->placeholder:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->breakStrategy:I

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
