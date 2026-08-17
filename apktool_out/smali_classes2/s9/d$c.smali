.class public final Ls9/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Lt9/k;


# direct methods
.method public constructor <init>(ILt9/k;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Ls9/d$c;->a:I

    .line 10
    .line 11
    iput-object p2, p0, Ls9/d$c;->b:Lt9/k;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lt9/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d$c;->b:Lt9/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Ls9/d$c;->a:I

    .line 2
    .line 3
    return v0
.end method
