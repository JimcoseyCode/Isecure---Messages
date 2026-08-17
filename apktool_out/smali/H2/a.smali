.class public final LH2/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private g:I

.field private final h:Lg2/a;


# direct methods
.method public constructor <init>(ILg2/a;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

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
    iput p1, p0, LH2/a;->g:I

    .line 10
    .line 11
    iput-object p2, p0, LH2/a;->h:Lg2/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/a;->h:Lg2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/a;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/a;->h:Lg2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, LH2/a;->g:I

    .line 2
    .line 3
    return v0
.end method
