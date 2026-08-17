.class final Lk6/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Landroid/media/Image;


# direct methods
.method constructor <init>(Landroid/media/Image;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk6/b;->a:Landroid/media/Image;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method final a()Landroid/media/Image;
    .locals 1

    .line 1
    iget-object v0, p0, Lk6/b;->a:Landroid/media/Image;

    .line 2
    .line 3
    return-object v0
.end method

.method final b()[Landroid/media/Image$Plane;
    .locals 1

    .line 1
    iget-object v0, p0, Lk6/b;->a:Landroid/media/Image;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
