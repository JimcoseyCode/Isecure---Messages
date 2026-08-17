.class LX1/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public final a:LX1/f;

.field public final b:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;LX1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LX1/h$a;->a:LX1/f;

    .line 5
    .line 6
    iput-object p1, p0, LX1/h$a;->b:Ljava/io/File;

    .line 7
    .line 8
    return-void
.end method
