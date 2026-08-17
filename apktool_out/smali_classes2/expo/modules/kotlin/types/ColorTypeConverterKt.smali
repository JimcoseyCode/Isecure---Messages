.class public final Lexpo/modules/kotlin/types/ColorTypeConverterKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "namedColors",
        "",
        "",
        "",
        "",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final namedColors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 154

    const/16 v0, 0xf0

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xf8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v2, v3, v3}, [Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "aliceblue"

    invoke-static {v4, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v2, 0xfa

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v4, 0xeb

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v6, 0xd7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v2, v4, v6, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v6, "antiquewhite"

    invoke-static {v6, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/4 v4, 0x0

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7, v3, v3, v3}, [Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "aqua"

    invoke-static {v9, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v9, 0x7f

    .line 4
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v11, 0xd4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v10, v3, v11, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "aquamarine"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 5
    const-string v11, "azure"

    filled-new-array {v0, v3, v3, v3}, [Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    const/16 v12, 0xf5

    .line 6
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v13, 0xdc

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v12, v12, v13, v3}, [Ljava/lang/Integer;

    move-result-object v14

    const-string v15, "beige"

    invoke-static {v15, v14}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    const/16 v15, 0xe4

    .line 7
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0xc4

    move/from16 v17, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v3, v15, v1, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v15, "bisque"

    invoke-static {v15, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 8
    const-string v15, "black"

    filled-new-array {v7, v7, v7, v3}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v15, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v15, 0xeb

    .line 9
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0xcd

    move/from16 v18, v9

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v3, v15, v9, v3}, [Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v16, v1

    const-string v1, "blanchedalmond"

    invoke-static {v1, v15}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 10
    const-string v15, "blue"

    move-object/from16 v19, v1

    filled-new-array {v7, v7, v3, v3}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v15, 0x8a

    .line 11
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v20, 0x2b

    move-object/from16 v21, v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v20, 0xe2

    move-object/from16 v22, v4

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v15, v1, v4, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "blueviolet"

    invoke-static {v4, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    const/16 v1, 0xa5

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v4, 0x2a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v20, 0x2a

    move-object/from16 v23, v5

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v1, v4, v5, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "brown"

    invoke-static {v4, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0xde

    .line 13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v20, 0xb8

    move/from16 v24, v4

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v20, 0x87

    move-object/from16 v25, v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v5, v4, v1, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "burlywood"

    invoke-static {v4, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0x5f

    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x9e

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v20, 0xa0

    move-object/from16 v26, v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v4, v5, v1, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "cadetblue"

    invoke-static {v4, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 15
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4, v3, v7, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "chartreuse"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0xd2

    .line 16
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v27, 0x69

    move-object/from16 v28, v1

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v27, 0x1e

    move-object/from16 v29, v4

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v5, v1, v4, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "chocolate"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 17
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v27, 0x50

    move-object/from16 v30, v4

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v3, v5, v4, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "coral"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0x64

    .line 18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v27, 0x95

    move-object/from16 v31, v4

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v27, 0xed

    move-object/from16 v32, v6

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v5, v4, v6, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "cornflowerblue"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 19
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v3, v5, v13, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "cornsilk"

    invoke-static {v6, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v6, 0x14

    .line 20
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v27, 0x3c

    move-object/from16 v33, v4

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v13, v6, v4, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v6, "crimson"

    invoke-static {v6, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 21
    const-string v6, "cyan"

    move-object/from16 v27, v4

    filled-new-array {v7, v3, v3, v3}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v6, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v6, 0x8b

    .line 22
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v34, v4

    filled-new-array {v7, v7, v6, v3}, [Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v35, v5

    const-string v5, "darkblue"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 23
    const-string v5, "darkcyan"

    move-object/from16 v36, v4

    filled-new-array {v7, v6, v6, v3}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0xb8

    .line 24
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v37, 0x86

    move-object/from16 v38, v4

    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v37, 0xb

    move-object/from16 v39, v8

    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v5, v4, v8, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkgoldenrod"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0xa9

    .line 25
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5, v5, v5, v3}, [Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v37, v4

    const-string v4, "darkgray"

    invoke-static {v4, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v8, 0x64

    .line 26
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v7, v8, v7, v3}, [Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v40, v4

    const-string v4, "darkgreen"

    invoke-static {v4, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 27
    const-string v8, "darkgrey"

    filled-new-array {v5, v5, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0xbd

    .line 28
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v41, 0xb7

    move-object/from16 v42, v4

    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v41, 0x6b

    move-object/from16 v43, v5

    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v8, v4, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkkhaki"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 29
    const-string v5, "darkmagenta"

    filled-new-array {v6, v7, v6, v3}, [Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0x55

    .line 30
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v44, v4

    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v41, 0x2f

    move-object/from16 v45, v5

    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v8, v4, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkolivegreen"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0x8c

    .line 31
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v3, v5, v7, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "darkorange"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v46, 0x99

    .line 32
    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v47, 0x32

    move-object/from16 v48, v4

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v47, 0xcc

    move-object/from16 v49, v5

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v8, v4, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkorchid"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 33
    const-string v5, "darkred"

    filled-new-array {v6, v7, v7, v3}, [Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0xe9

    .line 34
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v47, 0x96

    move-object/from16 v50, v4

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v47, 0x7a

    move-object/from16 v51, v5

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v8, v4, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darksalmon"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0x8f

    .line 35
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v8, 0xbc

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v47, 0x8f

    move-object/from16 v52, v4

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v5, v8, v4, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkseagreen"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0x48

    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v8, 0x3d

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v5, v8, v6, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "darkslateblue"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 37
    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v47, 0x4f

    move-object/from16 v53, v4

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v54, v5

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v8, v4, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkslategray"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 38
    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v8, 0x4f

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v55, v4

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v5, v8, v4, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "darkslategrey"

    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v5, 0xce

    .line 39
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v8, 0xd1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v7, v5, v8, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "darkturquoise"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0x94

    .line 40
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v47, 0xd3

    move-object/from16 v56, v4

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v8, v7, v4, v3}, [Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v47, v5

    const-string v5, "darkviolet"

    invoke-static {v5, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0x14

    .line 41
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v57, 0x93

    move-object/from16 v58, v5

    invoke-static/range {v57 .. v57}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v3, v8, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "deeppink"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0xbf

    .line 42
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v7, v8, v3, v3}, [Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v57, v5

    const-string v5, "deepskyblue"

    invoke-static {v5, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 43
    const-string v8, "dimgray"

    move-object/from16 v59, v5

    filled-new-array {v1, v1, v1, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 44
    const-string v8, "dimgrey"

    move-object/from16 v60, v5

    filled-new-array {v1, v1, v1, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0x1e

    .line 45
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v61, 0x90

    move-object/from16 v62, v5

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v8, v5, v3, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "dodgerblue"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0xb2

    .line 46
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v63, 0x22

    move-object/from16 v64, v5

    invoke-static/range {v63 .. v63}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v65, v10

    invoke-static/range {v63 .. v63}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v8, v5, v10, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "firebrick"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 47
    const-string v8, "floralwhite"

    filled-new-array {v3, v2, v0, v3}, [Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v10, 0x22

    .line 48
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v66, v5

    invoke-static/range {v63 .. v63}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v10, v6, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v10, "forestgreen"

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 49
    const-string v10, "fuchsia"

    move-object/from16 v63, v5

    filled-new-array {v3, v7, v3, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 50
    const-string v10, "gainsboro"

    filled-new-array {v13, v13, v13, v3}, [Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 51
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v67, v5

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v13, v5, v3, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v13, "ghostwhite"

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0xd7

    .line 52
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v3, v13, v7, v3}, [Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v17, v5

    const-string v5, "gold"

    invoke-static {v5, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0xda

    .line 53
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v68, 0xa5

    move-object/from16 v69, v5

    invoke-static/range {v68 .. v68}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v68, 0x20

    move-object/from16 v70, v8

    invoke-static/range {v68 .. v68}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v13, v5, v8, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "goldenrod"

    invoke-static {v8, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v8, 0x80

    .line 54
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8, v8, v8, v3}, [Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v68, v5

    const-string v5, "gray"

    invoke-static {v5, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 55
    const-string v13, "green"

    move-object/from16 v71, v5

    filled-new-array {v7, v8, v7, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0xad

    .line 56
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v72, v5

    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v13, v3, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v13, "greenyellow"

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 57
    const-string v13, "grey"

    move-object/from16 v41, v5

    filled-new-array {v8, v8, v8, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 58
    const-string v13, "honeydew"

    move-object/from16 v73, v5

    filled-new-array {v0, v3, v0, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0xb4

    .line 59
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v3, v1, v13, v3}, [Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v74, v5

    const-string v5, "hotpink"

    invoke-static {v5, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0x5c

    .line 60
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v75, 0x5c

    move-object/from16 v76, v5

    invoke-static/range {v75 .. v75}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v9, v13, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v13, "indianred"

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0x4b

    .line 61
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v75, 0x82

    move-object/from16 v77, v5

    invoke-static/range {v75 .. v75}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v13, v7, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v13, "indigo"

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 62
    const-string v13, "ivory"

    move-object/from16 v75, v5

    filled-new-array {v3, v3, v0, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v13, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v13, 0xe6

    .line 63
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v78, 0x8c

    move-object/from16 v79, v5

    invoke-static/range {v78 .. v78}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v0, v13, v5, v3}, [Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v78, v10

    const-string v10, "khaki"

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 64
    const-string v10, "lavender"

    move-object/from16 v80, v5

    filled-new-array {v13, v13, v2, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 65
    const-string v10, "lavenderblush"

    move-object/from16 v81, v5

    filled-new-array {v3, v0, v12, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v10, 0x7c

    .line 66
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v82, 0xfc

    move-object/from16 v83, v5

    invoke-static/range {v82 .. v82}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v10, v5, v7, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v10, "lawngreen"

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 67
    const-string v10, "lemonchiffon"

    move-object/from16 v82, v5

    filled-new-array {v3, v2, v9, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v10, 0xad

    .line 68
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v84, 0xd8

    move-object/from16 v85, v5

    invoke-static/range {v84 .. v84}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v10, v5, v13, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v10, "lightblue"

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 69
    const-string v10, "lightcoral"

    move-object/from16 v84, v5

    filled-new-array {v0, v8, v8, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v10, 0xe0

    .line 70
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v10, v3, v3, v3}, [Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v86, v5

    const-string v5, "lightcyan"

    invoke-static {v5, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v10, 0xd2

    .line 71
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v2, v2, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v87, v5

    const-string v5, "lightgoldenrodyellow"

    invoke-static {v5, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 72
    const-string v10, "lightgray"

    move-object/from16 v88, v5

    filled-new-array {v4, v4, v4, v3}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 73
    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v89, 0xee

    move-object/from16 v90, v5

    invoke-static/range {v89 .. v89}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v89, v11

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v10, v5, v11, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightgreen"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 74
    const-string v11, "lightgrey"

    move-object/from16 v91, v10

    filled-new-array {v4, v4, v4, v3}, [Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v11, 0xb6

    .line 75
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v92, 0xc1

    move-object/from16 v93, v10

    invoke-static/range {v92 .. v92}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v3, v11, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightpink"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 76
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v92, 0x7a

    move-object/from16 v94, v10

    invoke-static/range {v92 .. v92}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v3, v11, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightsalmon"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v11, 0x20

    .line 77
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v92, 0xb2

    move-object/from16 v95, v10

    invoke-static/range {v92 .. v92}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v92, 0xaa

    move-object/from16 v96, v14

    invoke-static/range {v92 .. v92}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v11, v10, v14, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightseagreen"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v11, 0x87

    .line 78
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v14, 0xce

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v11, v14, v2, v3}, [Ljava/lang/Integer;

    move-result-object v11

    const-string v14, "lightskyblue"

    invoke-static {v14, v11}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    const/16 v14, 0x77

    .line 79
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v92, 0x88

    move-object/from16 v97, v10

    invoke-static/range {v92 .. v92}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v92, v11

    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v14, v10, v11, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightslategray"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v11, 0x77

    .line 80
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v14, 0x88

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v98, v10

    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v11, v14, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightslategrey"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v11, 0xb0

    .line 81
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v14, 0xc4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v99, v10

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v11, v14, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "lightsteelblue"

    invoke-static {v11, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v11, 0xe0

    .line 82
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v3, v3, v11, v3}, [Ljava/lang/Integer;

    move-result-object v11

    const-string v14, "lightyellow"

    invoke-static {v14, v11}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    .line 83
    const-string v14, "lime"

    move-object/from16 v100, v10

    filled-new-array {v7, v3, v7, v3}, [Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v14, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v14, 0x32

    .line 84
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v101, 0x32

    move-object/from16 v102, v10

    invoke-static/range {v101 .. v101}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v14, v9, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    const-string v14, "limegreen"

    invoke-static {v14, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 85
    const-string v14, "linen"

    filled-new-array {v2, v0, v13, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 86
    const-string v14, "magenta"

    move-object/from16 v101, v0

    filled-new-array {v3, v7, v3, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 87
    const-string v14, "maroon"

    move-object/from16 v103, v0

    filled-new-array {v8, v7, v7, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v14, 0x66

    .line 88
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v104, 0xaa

    move-object/from16 v105, v0

    invoke-static/range {v104 .. v104}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v14, v9, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v14, "mediumaquamarine"

    invoke-static {v14, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 89
    const-string v14, "mediumblue"

    move-object/from16 v104, v0

    filled-new-array {v7, v7, v9, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v14, 0xba

    .line 90
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v106, 0x55

    move-object/from16 v107, v0

    invoke-static/range {v106 .. v106}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v14, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "mediumorchid"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0x93

    .line 91
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v14, 0x70

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v106, 0xdb

    move-object/from16 v108, v0

    invoke-static/range {v106 .. v106}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, v14, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "mediumpurple"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0x3c

    .line 92
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v106, 0xb3

    move-object/from16 v109, v0

    invoke-static/range {v106 .. v106}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v106, 0x71

    move-object/from16 v110, v10

    invoke-static/range {v106 .. v106}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v4, v0, v10, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "mediumseagreen"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0x7b

    .line 93
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v10, 0x68

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v4, v10, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v10, "mediumslateblue"

    invoke-static {v10, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v10, 0x9a

    .line 94
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v7, v2, v10, v3}, [Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v106, v0

    const-string v0, "mediumspringgreen"

    invoke-static {v0, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0x48

    .line 95
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v111, 0xd1

    move-object/from16 v112, v0

    invoke-static/range {v111 .. v111}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v111, 0xcc

    move-object/from16 v113, v4

    invoke-static/range {v111 .. v111}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v10, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "mediumturquoise"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0xc7

    .line 96
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v10, 0x15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v111, 0x85

    move-object/from16 v114, v0

    invoke-static/range {v111 .. v111}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "mediumvioletred"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0x19

    .line 97
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v10, 0x19

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v4, v10, v14, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v10, "midnightblue"

    invoke-static {v10, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 98
    const-string v10, "mintcream"

    move-object/from16 v111, v0

    filled-new-array {v12, v3, v2, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xe4

    .line 99
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v115, 0xe1

    move-object/from16 v116, v0

    invoke-static/range {v115 .. v115}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "mistyrose"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xe4

    .line 100
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v115, 0xb5

    move-object/from16 v117, v0

    invoke-static/range {v115 .. v115}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "moccasin"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 101
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v115, 0xad

    move-object/from16 v118, v0

    invoke-static/range {v115 .. v115}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "navajowhite"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 102
    const-string v10, "navy"

    move-object/from16 v115, v0

    filled-new-array {v7, v7, v8, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xfd

    .line 103
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v10, v12, v13, v3}, [Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v119, v0

    const-string v0, "oldlace"

    invoke-static {v0, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 104
    const-string v10, "olive"

    move-object/from16 v120, v0

    filled-new-array {v8, v8, v7, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0x6b

    .line 105
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v121, 0x8e

    move-object/from16 v122, v0

    invoke-static/range {v121 .. v121}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v121, 0x23

    move-object/from16 v123, v4

    invoke-static/range {v121 .. v121}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v10, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "olivedrab"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0xa5

    .line 106
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v3, v4, v7, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v10, "orange"

    invoke-static {v10, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v10, 0x45

    .line 107
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v3, v10, v7, v3}, [Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v121, v0

    const-string v0, "orangered"

    invoke-static {v0, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xda

    .line 108
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0xd6

    move-object/from16 v125, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v10, v14, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "orchid"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xe8

    .line 109
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0xaa

    move-object/from16 v126, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v5, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "palegoldenrod"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0x98

    .line 110
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0xfb

    move-object/from16 v127, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v124, 0x98

    move-object/from16 v128, v4

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v10, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "palegreen"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0xaf

    .line 111
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4, v5, v5, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v10, "paleturquoise"

    invoke-static {v10, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v10, 0xdb

    .line 112
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0x93

    move-object/from16 v129, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v10, v14, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "palevioletred"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xef

    .line 113
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0xd5

    move-object/from16 v130, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "papayawhip"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xda

    .line 114
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0xb9

    move-object/from16 v131, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "peachpuff"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0x85

    .line 115
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0x3f

    move-object/from16 v132, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v9, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "peru"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xc0

    .line 116
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v124, 0xcb

    move-object/from16 v133, v0

    invoke-static/range {v124 .. v124}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, v10, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "pink"

    invoke-static {v10, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v10, 0xdd

    .line 117
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v124, v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v134, 0xdd

    move-object/from16 v135, v4

    invoke-static/range {v134 .. v134}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v10, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "plum"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0xb0

    .line 118
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v10, 0xe0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v4, v10, v13, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v10, "powderblue"

    invoke-static {v10, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 119
    const-string v10, "purple"

    filled-new-array {v8, v7, v8, v3}, [Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/16 v13, 0x66

    .line 120
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v134, 0x33

    move-object/from16 v136, v0

    invoke-static/range {v134 .. v134}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v134, v4

    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v13, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "rebeccapurple"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 121
    const-string v4, "red"

    filled-new-array {v3, v7, v7, v3}, [Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v4, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v13, 0xbc

    .line 122
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v46, 0x8f

    move-object/from16 v137, v0

    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v138, v4

    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v13, v0, v4, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "rosybrown"

    invoke-static {v4, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v4, 0x41

    .line 123
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v13, 0xe1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v4, v1, v13, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "royalblue"

    invoke-static {v4, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0x45

    .line 124
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v13, 0x13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v6, v4, v13, v3}, [Ljava/lang/Integer;

    move-result-object v4

    const-string v13, "saddlebrown"

    invoke-static {v13, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v13, 0x72

    .line 125
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v2, v8, v13, v3}, [Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v46, v0

    const-string v0, "salmon"

    invoke-static {v0, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v13, 0xf4

    .line 126
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v139, 0xa4

    move-object/from16 v140, v0

    invoke-static/range {v139 .. v139}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v139, 0x60

    move-object/from16 v141, v1

    invoke-static/range {v139 .. v139}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v13, v0, v1, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "sandybrown"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x2e

    .line 127
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v13, 0x57

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v1, v6, v13, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v6, "seagreen"

    invoke-static {v6, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 128
    const-string v6, "seashell"

    filled-new-array {v3, v12, v5, v3}, [Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .line 129
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v20, 0x52

    move-object/from16 v139, v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v20, 0x2d

    move-object/from16 v142, v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v13, v0, v1, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "sienna"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc0

    .line 130
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v13, 0xc0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v20, 0xc0

    move-object/from16 v143, v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v13, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "silver"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x87

    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v13, 0xce

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v20, 0xeb

    move-object/from16 v144, v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v13, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "skyblue"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6a

    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v13, 0x5a

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v1, v13, v9, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v13, "slateblue"

    invoke-static {v13, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 133
    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v14, v8, v13, v3}, [Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v20, v0

    const-string v0, "slategray"

    invoke-static {v0, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 134
    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v14, v8, v13, v3}, [Ljava/lang/Integer;

    move-result-object v13

    const-string v14, "slategrey"

    invoke-static {v14, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    .line 135
    const-string v14, "snow"

    filled-new-array {v3, v2, v2, v3}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v14, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 136
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v7, v3, v14, v3}, [Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v18, v0

    const-string v0, "springgreen"

    invoke-static {v0, v14}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v14, 0x46

    .line 137
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v61, 0x82

    move-object/from16 v145, v0

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v61, 0xb4

    move-object/from16 v146, v1

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v14, v0, v1, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "steelblue"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd2

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v14, 0xb4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v61, 0x8c

    move-object/from16 v147, v0

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v14, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "tan"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 139
    const-string v1, "teal"

    filled-new-array {v7, v8, v8, v3}, [Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v8, 0xd8

    .line 140
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v14, 0xbf

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v61, 0xd8

    move-object/from16 v148, v0

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v8, v14, v0, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v8, "thistle"

    invoke-static {v8, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v8, 0x63

    .line 141
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v14, 0x47

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v3, v8, v14, v3}, [Ljava/lang/Integer;

    move-result-object v8

    const-string v14, "tomato"

    invoke-static {v14, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 142
    const-string v14, "transparent"

    move-object/from16 v61, v0

    filled-new-array {v7, v7, v7, v7}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v14, 0x40

    .line 143
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v149, 0xe0

    move-object/from16 v150, v0

    invoke-static/range {v149 .. v149}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v149, 0xd0

    move-object/from16 v151, v1

    invoke-static/range {v149 .. v149}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v14, v0, v1, v3}, [Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "turquoise"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x82

    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v5, v1, v5, v3}, [Ljava/lang/Integer;

    move-result-object v1

    const-string v5, "violet"

    invoke-static {v5, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 145
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v14, 0xb3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v12, v5, v14, v3}, [Ljava/lang/Integer;

    move-result-object v5

    const-string v14, "wheat"

    invoke-static {v14, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v149

    .line 146
    const-string v5, "white"

    filled-new-array {v3, v3, v3, v3}, [Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 147
    const-string v14, "whitesmoke"

    filled-new-array {v12, v12, v12, v3}, [Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v14, v12}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    .line 148
    const-string v14, "yellow"

    filled-new-array {v3, v3, v7, v3}, [Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v14, v7}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v152

    const/16 v7, 0x9a

    .line 149
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v14, 0x32

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v7, v9, v14, v3}, [Ljava/lang/Integer;

    move-result-object v3

    const-string v7, "yellowgreen"

    invoke-static {v7, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v153

    move-object/from16 v7, v132

    move-object/from16 v132, v6

    move-object/from16 v6, v32

    move-object/from16 v32, v44

    move-object/from16 v44, v58

    move-object/from16 v58, v71

    move-object/from16 v71, v85

    move-object/from16 v85, v100

    move-object/from16 v100, v111

    move-object/from16 v111, v125

    move-object/from16 v125, v138

    move-object/from16 v138, v13

    move-object/from16 v13, v19

    move-object/from16 v19, v29

    move-object/from16 v29, v40

    move-object/from16 v40, v54

    move-object/from16 v54, v78

    move-object/from16 v78, v93

    move-object/from16 v93, v107

    move-object/from16 v107, v120

    move-object/from16 v120, v124

    move-object/from16 v124, v137

    move-object/from16 v137, v18

    move-object/from16 v18, v28

    move-object/from16 v28, v37

    move-object/from16 v37, v51

    move-object/from16 v51, v70

    move-object/from16 v70, v82

    move-object/from16 v82, v92

    move-object/from16 v92, v104

    move-object/from16 v104, v118

    move-object/from16 v118, v7

    move-object/from16 v14, v21

    move-object/from16 v24, v27

    move-object/from16 v21, v31

    move-object/from16 v27, v38

    move-object/from16 v7, v39

    move-object/from16 v31, v43

    move-object/from16 v43, v47

    move-object/from16 v38, v52

    move-object/from16 v39, v53

    move-object/from16 v47, v60

    move-object/from16 v52, v63

    move-object/from16 v53, v67

    move-object/from16 v63, v76

    move-object/from16 v67, v80

    move-object/from16 v9, v89

    move-object/from16 v76, v90

    move-object/from16 v80, v95

    move-object/from16 v89, v101

    move-object/from16 v90, v103

    move-object/from16 v95, v109

    move-object/from16 v103, v117

    move-object/from16 v109, v121

    move-object/from16 v101, v123

    move-object/from16 v117, v131

    move-object/from16 v121, v136

    move-object/from16 v131, v142

    move-object/from16 v136, v146

    move-object/from16 v142, v148

    move-object/from16 v146, v150

    move-object/from16 v148, v1

    move-object/from16 v150, v5

    move-object/from16 v123, v10

    move-object/from16 v5, v23

    move-object/from16 v23, v35

    move-object/from16 v60, v41

    move-object/from16 v35, v49

    move-object/from16 v41, v55

    move-object/from16 v49, v64

    move-object/from16 v64, v77

    move-object/from16 v77, v91

    move-object/from16 v10, v96

    move-object/from16 v91, v105

    move-object/from16 v96, v106

    move-object/from16 v105, v115

    move-object/from16 v106, v119

    move-object/from16 v119, v133

    move-object/from16 v115, v135

    move-object/from16 v133, v143

    move-object/from16 v143, v151

    move-object/from16 v151, v12

    move-object/from16 v55, v17

    move-object/from16 v135, v20

    move-object/from16 v12, v22

    move-object/from16 v17, v26

    move-object/from16 v20, v30

    move-object/from16 v22, v33

    move-object/from16 v26, v36

    move-object/from16 v30, v42

    move-object/from16 v33, v45

    move-object/from16 v36, v50

    move-object/from16 v42, v56

    move-object/from16 v45, v57

    move-object/from16 v50, v66

    move-object/from16 v57, v68

    move-object/from16 v56, v69

    move-object/from16 v66, v79

    move-object/from16 v68, v81

    move-object/from16 v69, v83

    move-object/from16 v79, v94

    move-object/from16 v81, v97

    move-object/from16 v83, v98

    move-object/from16 v94, v108

    move-object/from16 v98, v112

    move-object/from16 v97, v113

    move-object/from16 v108, v122

    move-object/from16 v112, v126

    move-object/from16 v113, v127

    move-object/from16 v122, v134

    move-object/from16 v127, v141

    move-object/from16 v134, v144

    move-object/from16 v141, v147

    move-object/from16 v147, v0

    move-object/from16 v126, v46

    move-object/from16 v46, v59

    move-object/from16 v144, v61

    move-object/from16 v59, v72

    move-object/from16 v61, v73

    move-object/from16 v72, v84

    move-object/from16 v73, v86

    move-object/from16 v84, v99

    move-object/from16 v99, v114

    move-object/from16 v114, v129

    move-object/from16 v129, v140

    move-object/from16 v140, v145

    move-object/from16 v145, v8

    move-object/from16 v86, v11

    move-object/from16 v11, v16

    move-object/from16 v16, v25

    move-object/from16 v25, v34

    move-object/from16 v34, v48

    move-object/from16 v48, v62

    move-object/from16 v8, v65

    move-object/from16 v62, v74

    move-object/from16 v65, v75

    move-object/from16 v74, v87

    move-object/from16 v75, v88

    move-object/from16 v87, v102

    move-object/from16 v88, v110

    move-object/from16 v102, v116

    move-object/from16 v110, v128

    move-object/from16 v116, v130

    move-object/from16 v130, v139

    move-object/from16 v139, v2

    move-object/from16 v128, v4

    filled-new-array/range {v5 .. v153}, [Lkotlin/Pair;

    move-result-object v0

    .line 150
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 151
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lj7/K;->e(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 152
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 153
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 154
    check-cast v2, Ljava/util/Map$Entry;

    .line 155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 156
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Integer;

    .line 157
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    array-length v5, v2

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    aget-object v7, v2, v6

    .line 159
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x437f0000    # 255.0f

    div-float/2addr v7, v8

    .line 160
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    .line 161
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 162
    :cond_0
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 163
    :cond_1
    sput-object v1, Lexpo/modules/kotlin/types/ColorTypeConverterKt;->namedColors:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getNamedColors$p()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/types/ColorTypeConverterKt;->namedColors:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
