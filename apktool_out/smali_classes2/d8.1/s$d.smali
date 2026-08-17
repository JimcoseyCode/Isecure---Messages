.class public final Ld8/s$d;
.super Ld8/s;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final j:Lt8/e;


# direct methods
.method public constructor <init>(Lt8/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ld8/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ld8/s$d;->j:Lt8/e;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final i()Lt8/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/s$d;->j:Lt8/e;

    .line 2
    .line 3
    return-object v0
.end method
