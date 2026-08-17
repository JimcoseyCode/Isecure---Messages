.class public final Ls9/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:Lt9/k;

.field private final c:J


# direct methods
.method public constructor <init>(ILt9/k;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ls9/d$a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Ls9/d$a;->b:Lt9/k;

    .line 7
    .line 8
    iput-wide p3, p0, Ls9/d$a;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ls9/d$a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Ls9/d$a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lt9/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d$a;->b:Lt9/k;

    .line 2
    .line 3
    return-object v0
.end method
