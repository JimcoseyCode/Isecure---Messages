.class LH1/g$a;
.super LN1/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final g:Landroid/os/Handler;

.field final h:I

.field private final i:J

.field private j:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Landroid/os/Handler;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, LN1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH1/g$a;->g:Landroid/os/Handler;

    .line 5
    .line 6
    iput p2, p0, LH1/g$a;->h:I

    .line 7
    .line 8
    iput-wide p3, p0, LH1/g$a;->i:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method a()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, LH1/g$a;->j:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public onLoadCleared(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LH1/g$a;->j:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    return-void
.end method

.method public onResourceReady(Landroid/graphics/Bitmap;LO1/b;)V
    .locals 2

    .line 2
    iput-object p1, p0, LH1/g$a;->j:Landroid/graphics/Bitmap;

    .line 3
    iget-object p1, p0, LH1/g$a;->g:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 4
    iget-object p2, p0, LH1/g$a;->g:Landroid/os/Handler;

    iget-wide v0, p0, LH1/g$a;->i:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;LO1/b;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, LH1/g$a;->onResourceReady(Landroid/graphics/Bitmap;LO1/b;)V

    return-void
.end method
