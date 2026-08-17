.class public final synthetic Lexpo/modules/kotlin/views/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/Filter;


# instance fields
.field public final synthetic a:Lexpo/modules/kotlin/views/FilteredReadableMap;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/views/FilteredReadableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/views/b;->a:Lexpo/modules/kotlin/views/FilteredReadableMap;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/b;->a:Lexpo/modules/kotlin/views/FilteredReadableMap;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lexpo/modules/kotlin/views/FilteredReadableMap;->b(Lexpo/modules/kotlin/views/FilteredReadableMap;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
