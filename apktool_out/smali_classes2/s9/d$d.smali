.class public abstract Ls9/d$d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field private final g:Z

.field private final h:Lt9/j;

.field private final i:Lt9/i;


# direct methods
.method public constructor <init>(ZLt9/j;Lt9/i;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sink"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Ls9/d$d;->g:Z

    .line 15
    .line 16
    iput-object p2, p0, Ls9/d$d;->h:Lt9/j;

    .line 17
    .line 18
    iput-object p3, p0, Ls9/d$d;->i:Lt9/i;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls9/d$d;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lt9/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d$d;->i:Lt9/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lt9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d$d;->h:Lt9/j;

    .line 2
    .line 3
    return-object v0
.end method
