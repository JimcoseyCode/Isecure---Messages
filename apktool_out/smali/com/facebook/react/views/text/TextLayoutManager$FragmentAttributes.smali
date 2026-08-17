.class final Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/TextLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "FragmentAttributes"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\r\u0008\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;",
        "",
        "props",
        "Lcom/facebook/react/views/text/TextAttributeProps;",
        "length",
        "",
        "reactTag",
        "isAttachment",
        "",
        "width",
        "",
        "height",
        "<init>",
        "(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V",
        "getProps",
        "()Lcom/facebook/react/views/text/TextAttributeProps;",
        "getLength",
        "()I",
        "getReactTag",
        "()Z",
        "getWidth",
        "()D",
        "getHeight",
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
.field private final height:D

.field private final isAttachment:Z

.field private final length:I

.field private final props:Lcom/facebook/react/views/text/TextAttributeProps;

.field private final reactTag:I

.field private final width:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V
    .locals 1

    .line 1
    const-string v0, "props"

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
    iput-object p1, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->props:Lcom/facebook/react/views/text/TextAttributeProps;

    .line 10
    .line 11
    iput p2, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->length:I

    .line 12
    .line 13
    iput p3, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->reactTag:I

    .line 14
    .line 15
    iput-boolean p4, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->isAttachment:Z

    .line 16
    .line 17
    iput-wide p5, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->width:D

    .line 18
    .line 19
    iput-wide p7, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->height:D

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final getHeight()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->height:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->length:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProps()Lcom/facebook/react/views/text/TextAttributeProps;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->props:Lcom/facebook/react/views/text/TextAttributeProps;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReactTag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->reactTag:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWidth()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->width:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final isAttachment()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->isAttachment:Z

    .line 2
    .line 3
    return v0
.end method
